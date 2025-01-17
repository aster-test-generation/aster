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
  public void testGetUnLocode_TzFS0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("456");
    UnLocode unLocode = new UnLocode("789");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    UnLocode result = attempt.getUnLocode();
    assertEquals(unLocode, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_SMnI0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("456");
    UnLocode unLocode = new UnLocode("USA-LAX");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    VoyageNumber result = attempt.getVoyageNumber();
    assertEquals(voyageNumber, result);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testToString_Rdie0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("12345");
    VoyageNumber voyageNumber = new VoyageNumber("V12345");
    HandlingEvent.Type type = HandlingEvent.Type.LOAD;
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, type, unLocode);
    String expected = "HandlingEventRegistrationAttempt{" + "registrationTime=" + registrationDate + ", completionTime=" + completionDate + ", trackingId=" + trackingId + ", voyageNumber=" + voyageNumber + ", type=" + type + ", unLocode=" + unLocode + '}';
    assertEquals(expected, attempt.toString());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_JyQb0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("USNYC");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(completionDate, attempt.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetRegistrationTime_NMRW0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.of(2022, 1, 1, 0, 0);
    LocalDateTime completionDate = LocalDateTime.of(2022, 1, 1, 1, 0);
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("DE HAM");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assertEquals(registrationDate, attempt.getRegistrationTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeLoad_SWZm0() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("DE FRK");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.LOAD, unLocode);
    assert attempt.getType() == HandlingEvent.Type.LOAD;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeUnload_wwQh1() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("DE FRK");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.UNLOAD, unLocode);
    assert attempt.getType() == HandlingEvent.Type.UNLOAD;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeReceive_lDnJ2() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("DE FRK");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.RECEIVE, unLocode);
    assert attempt.getType() == HandlingEvent.Type.RECEIVE;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeClaim_jUDb3() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("DE FRK");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.CLAIM, unLocode);
    assert attempt.getType() == HandlingEvent.Type.CLAIM;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTypeCustoms_Gnam4() throws Exception {
    LocalDateTime registrationDate = LocalDateTime.now();
    LocalDateTime completionDate = LocalDateTime.now();
    TrackingId trackingId = new TrackingId("123");
    VoyageNumber voyageNumber = new VoyageNumber("123");
    UnLocode unLocode = new UnLocode("DE FRK");
    HandlingEventRegistrationAttempt attempt = new HandlingEventRegistrationAttempt(registrationDate, completionDate, trackingId, voyageNumber, HandlingEvent.Type.CUSTOMS, unLocode);
    assert attempt.getType() == HandlingEvent.Type.CUSTOMS;
  }
}