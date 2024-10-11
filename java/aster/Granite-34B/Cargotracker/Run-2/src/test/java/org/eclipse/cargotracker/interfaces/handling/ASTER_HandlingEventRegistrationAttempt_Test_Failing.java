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
  public void testToString_AAXK0() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.of(2022, 1, 1, 12, 0),
            LocalDateTime.of(2022, 1, 2, 12, 0),
            new TrackingId("ABC123"),
            new VoyageNumber("V123"),
            HandlingEvent.Type.LOAD,
            new UnLocode("USCHI")
    );
    assertEquals("HandlingEventRegistrationAttempt{" +
            "registrationTime=2022-01-01T12:00, " +
            "completionTime=2022-01-02T12:00, " +
            "trackingId=TrackingId{id='ABC123'}, " +
            "voyageNumber=VoyageNumber{number='V123'}, " +
            "type=LOAD, " +
            "unLocode=UnLocode{countryAndLocation='USCHI'}" +
            "}", attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getRegistrationTime_returns_registration_time_for_unload_event_Ungf1() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.of(2022, 1, 3, 14, 0),
            LocalDateTime.of(2022, 1, 4, 16, 0),
            new TrackingId("DEF456"),
            new VoyageNumber("UVW789"),
            HandlingEvent.Type.UNLOAD,
            new UnLocode("JPNTOK")
    );
    assertEquals(LocalDateTime.of(2022, 1, 3, 14, 0), attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getRegistrationTime_returns_registration_time_for_claim_event_bAwY3() {
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(
            LocalDateTime.of(2022, 1, 7, 12, 0),
            LocalDateTime.of(2022, 1, 8, 14, 0),
            new TrackingId("MNO012"),
            new VoyageNumber("PQR345"),
            HandlingEvent.Type.CLAIM,
            new UnLocode("AUSMEL")
    );
    assertEquals(LocalDateTime.of(2022, 1, 7, 12, 0), attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest2_rUQl1() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId(), new VoyageNumber("number"), HandlingEvent.Type.LOAD, new UnLocode("USNYC"));
    TrackingId trackingId = handlingEventRegistrationAttempt.getTrackingId();
    assertEquals(trackingId, new TrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest_WsRf0_fid2() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId("id"), new VoyageNumber("number"), HandlingEvent.Type.LOAD, new UnLocode("countryAndLocation"));
    TrackingId trackingId = handlingEventRegistrationAttempt.getTrackingId();
    assertEquals(trackingId, new TrackingId("id"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest2_rUQl1_fid2() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId(), new VoyageNumber("number"), HandlingEvent.Type.LOAD, new UnLocode("countryAndLocation"));
    TrackingId trackingId = handlingEventRegistrationAttempt.getTrackingId();
    assertEquals(trackingId, new TrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest3_tefA2_fid2() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId("id"), new VoyageNumber(), HandlingEvent.Type.LOAD, new UnLocode("countryAndLocation"));
    TrackingId trackingId = handlingEventRegistrationAttempt.getTrackingId();
    assertEquals(trackingId, new TrackingId("id"));
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingIdTest4_icGf3_fid2() {
    HandlingEventRegistrationAttempt handlingEventRegistrationAttempt = new HandlingEventRegistrationAttempt(LocalDateTime.now(), LocalDateTime.now(), new TrackingId("id"), new VoyageNumber("number"), HandlingEvent.Type.CLAIM, new UnLocode("countryAndLocation"));
    TrackingId trackingId = handlingEventRegistrationAttempt.getTrackingId();
    assertEquals(trackingId, new TrackingId("id"));
  }
}