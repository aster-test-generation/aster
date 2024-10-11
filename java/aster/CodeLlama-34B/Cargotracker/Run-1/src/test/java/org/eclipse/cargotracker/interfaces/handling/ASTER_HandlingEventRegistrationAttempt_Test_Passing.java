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
  public void testToString_wcTz0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 12, 12, 12, 12, 12);
    LocalDateTime completionDate = LocalDateTime.of(2022, 12, 12, 12, 12, 12);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=" + registrationDate + ", completionTime=" + completionDate + ", trackingId=" + trackingId + ", voyageNumber=" + voyageNumber + ", type=" + type + ", unLocode=" + unLocode + '}';
    String actual = attempt.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToStringWithNullValues_PuEl1() {
    LocalDateTime registrationDate = null;
    LocalDateTime completionDate = null;
    TrackingId trackingId = null;
    VoyageNumber voyageNumber = null;
    HandlingEvent.Type type = null;
    UnLocode unLocode = null;
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=null, completionTime=null, trackingId=null, voyageNumber=null, type=null, unLocode=null}";
    String actual = attempt.toString();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_bpxU0() {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeWithNullType_FHDU1() {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, null, unLocode);
    assertNull(attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeWithInvalidType_kqNW2() {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.CLAIM, unLocode);
    assertNotEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeWithNullRegistrationDate_WAAC3() {
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(null, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeWithNullCompletionDate_gPOM4() {
    LocalDateTime registrationDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, null, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeWithNullTrackingId_GFzB5() {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USCHI");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, null, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_ynxh0() {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = registrationDate.plusDays(1);
    TrackingId trackingId = new TrackingId("1234567890");
    VoyageNumber voyageNumber = new VoyageNumber("1234567890");
    UnLocode unLocode = new UnLocode("USLAX");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(voyageNumber, attempt.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_fkLv0() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.now(),
            LocalDateTime.now(),
            new TrackingId("1234567890"),
            new VoyageNumber("1234567890"),
            HandlingEvent.Type.LOAD,
            new UnLocode("USCHI")
    );
    assertEquals("1234567890", attempt.getTrackingId().getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNullTrackingId_hiSi1() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.now(),
            LocalDateTime.now(),
            null,
            new VoyageNumber("1234567890"),
            HandlingEvent.Type.LOAD,
            new UnLocode("USCHI")
    );
    assertNull(attempt.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithEmptyTrackingId_bADz2() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.now(),
            LocalDateTime.now(),
            new TrackingId(""),
            new VoyageNumber("1234567890"),
            HandlingEvent.Type.LOAD,
            new UnLocode("USCHI")
    );
    assertEquals("", attempt.getTrackingId().getIdString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_WtMM0() {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 10, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 11, 0);
    TrackingId trackingId = new TrackingId("123456789");
    VoyageNumber voyageNumber = new VoyageNumber("123456789");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USLAX");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    LocalDateTime completionTime = attempt.getCompletionTime();
    assertEquals(completionDate, completionTime);
  }
}