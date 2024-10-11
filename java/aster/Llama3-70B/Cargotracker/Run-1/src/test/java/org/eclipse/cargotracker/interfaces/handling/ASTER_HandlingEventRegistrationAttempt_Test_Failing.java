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
  public void testGetUnLocode_Zaif0_fid1() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    TrackingId trackingId = new TrackingId("id");
    VoyageNumber voyageNumber = new VoyageNumber("number");
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    UnLocode result = handlingEventRegistrationAttempt.getUnLocode();
    assertEquals(unLocode, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetType_ZTVv0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    VoyageNumber voyageNumber = new VoyageNumber("number");
    TrackingId trackingId = new TrackingId("id");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(HandlingEvent.Type.LOAD, attempt.getType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_pTrn0() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.now(),
            LocalDateTime.now(),
            new TrackingId("id"),
            new VoyageNumber("number"),
            HandlingEvent.Type.LOAD,
            new UnLocode("countryAndLocation"));
    VoyageNumber voyageNumber = handlingEventRegistrationAttempt.getVoyageNumber();
    assertEquals(new VoyageNumber("number"), voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTime_DwJz0() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    VoyageNumber voyageNumber = new VoyageNumber("number");
    TrackingId trackingId = new TrackingId("id");
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(LocalDateTime.now(), handlingEventRegistrationAttempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_TxWM0_fid1() {
    UnLocode unLocode = new UnLocode("countryAndLocation");
    VoyageNumber voyageNumber = new VoyageNumber("number");
    TrackingId trackingId = new TrackingId("id");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    TrackingId result = attempt.getTrackingId();
    assertEquals(trackingId, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_cOGd0_EEZk0_fid1() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId("id"), new VoyageNumber("number"), HandlingEvent.Type.LOAD, new UnLocode("countryAndLocation"));
    assertEquals("HandlingEventRegistrationAttempt{registrationTime=" + handlingEventRegistrationAttempt.getRegistrationTime() + ", completionTime=" + handlingEventRegistrationAttempt.getCompletionTime() + ", trackingId=" + handlingEventRegistrationAttempt.getTrackingId() + ", voyageNumber=" + handlingEventRegistrationAttempt.getVoyageNumber() + ", type=" + handlingEventRegistrationAttempt.getType() + ", unLocode=" + handlingEventRegistrationAttempt.getUnLocode() + '}', handlingEventRegistrationAttempt.toString());
  }
}