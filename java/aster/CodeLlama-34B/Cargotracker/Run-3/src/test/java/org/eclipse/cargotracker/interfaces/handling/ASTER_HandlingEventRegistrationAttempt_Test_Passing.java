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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingEventRegistrationAttempt_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_KdQz0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=" + registrationDate + ", completionTime=" + completionDate + ", trackingId=" + trackingId + ", voyageNumber=" + voyageNumber + ", type=" + type + ", unLocode=" + unLocode + '}';
    assertEquals(expected, attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullValues_GvEq1() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = null;
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=" + registrationDate + ", completionTime=" + completionDate + ", trackingId=" + trackingId + ", voyageNumber=" + voyageNumber + ", type=" + type + ", unLocode=" + null + '}';
    assertEquals(expected, attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithEmptyValues_wbPB2() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=" + registrationDate + ", completionTime=" + completionDate + ", trackingId=" + trackingId + ", voyageNumber=" + voyageNumber + ", type=" + type + ", unLocode=" + "" + '}';
    assertEquals(expected, attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_load_WKPZ0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, new UnLocode("US"));
    assertEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_unload_wenm1() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.UNLOAD, new UnLocode("US"));
    assertEquals(HandlingEvent.Type.UNLOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_receive_kTVC2() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.RECEIVE, new UnLocode("US"));
    assertEquals(HandlingEvent.Type.RECEIVE, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_claim_eXlX3() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.CLAIM, new UnLocode("US"));
    assertEquals(HandlingEvent.Type.CLAIM, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_customs_OwRU4() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.CUSTOMS, new UnLocode("US"));
    assertEquals(HandlingEvent.Type.CUSTOMS, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_peMO0_1() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertNotNull(attempt.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_peMO0_2() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(voyageNumber, attempt.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTimeWithNullVoyageNumber_ykQh4() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0);
    TrackingId trackingId = new TrackingId("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, null, type, unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetTrackingId_xbhN0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(trackingId, attempt.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetTrackingIdWithNullTrackingId_sikO1() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = null;
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertNull(attempt.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetTrackingIdWithNullVoyageNumber_LeRA2() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = null;
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(trackingId, attempt.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetTrackingIdWithNullType_YSBR3() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = null;
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(trackingId, attempt.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void testGetTrackingIdWithNullUnLocode_yMwx4() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = null;
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    assertEquals(trackingId, attempt.getTrackingId());
  }
}