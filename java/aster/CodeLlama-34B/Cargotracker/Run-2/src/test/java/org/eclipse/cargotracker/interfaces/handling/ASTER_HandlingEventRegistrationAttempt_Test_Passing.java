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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEventRegistrationAttempt_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_hUIz0() {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now().plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(unLocode, attempt.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_vmWO0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0);
    TrackingId trackingId = new TrackingId("123456789");
    VoyageNumber voyageNumber = new VoyageNumber("123456789");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=" + registrationDate + ", completionTime=" + completionDate + ", trackingId=" + trackingId + ", voyageNumber=" + voyageNumber + ", type=" + type + ", unLocode=" + unLocode + '}';
    assertEquals(expected, attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType1_rdRg0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(type, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType2_wDWW1() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.UNLOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(type, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType3_ZZbe2() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.RECEIVE;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(type, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType4_MGaP3() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.CLAIM;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(type, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_OkyA0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 1, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(voyageNumber, attempt.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTime_JwLt0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(registrationDate, attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTimeWithNullRegistrationDate_KkCb1() {
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(null, completionDate, trackingId, voyageNumber, type, unLocode);
    assertNull(attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTimeWithNullCompletionDate_xmiV2() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, null, trackingId, voyageNumber, type, unLocode);
    assertEquals(registrationDate, attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTimeWithNullTrackingId_NVVe3() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, null, voyageNumber, type, unLocode);
    assertEquals(registrationDate, attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_TeJB0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(completionDate, attempt.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeWithNullCompletionDate_adIb1() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = null;
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertNull(attempt.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeWithNullRegistrationDate_QXUx2() {
    LocalDateTime registrationDate = null;
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeWithNullTrackingId_sQWX3() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = null;
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(completionDate, attempt.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTimeWithNullVoyageNumber_lzCL4() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = null;
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
  }
}