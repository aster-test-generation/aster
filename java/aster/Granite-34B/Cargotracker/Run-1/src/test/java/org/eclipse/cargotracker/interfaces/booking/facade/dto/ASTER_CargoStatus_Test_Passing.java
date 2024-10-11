/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoStatus_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_LjdE0() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    boolean actual = cargoStatus.isMisdirected();
    boolean expected = true;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected2_CgOr1() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    boolean actual = cargoStatus.isMisdirected();
    boolean expected = false;
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingId_returnsTrackingId_ioaW0() {
    CargoStatus cargoStatus = new CargoStatus("ABC123", "New York", "In Transit", false, "2022-12-31", "Next Stop: Chicago", new ArrayList<TrackingEvents>());
    assertEquals("ABC123", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getTrackingId_returnsTrackingId_forAnotherCargo_jvDR1() {
    CargoStatus cargoStatus = new CargoStatus("XYZ789", "Los Angeles", " delivered", true, "2022-11-15", " delivered", new ArrayList<TrackingEvents>());
    assertEquals("XYZ789", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDestinationTest_RTiB0() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("destination", cargoStatus.getDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDestinationTestWithNullDestination_PpSw1() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", null, "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals(null, cargoStatus.getDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void getDestinationTestWithEmptyDestination_Afxm2() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("", cargoStatus.getDestination());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusText_lBaY0() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("statusText", cargoStatus.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithNullStatusText_KjbN1() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", null, true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithEmptyStatusText_NhsC2() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("", cargoStatus.getStatusText());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEta_lrem0() {
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("eta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  void getNextExpectedActivity_emptyHandlingEvents_vQCn6() {
    List<TrackingEvents> handlingEvents = new ArrayList<>();
    CargoStatus cargoStatus = new CargoStatus("trackigId", "destination", "statusText", true, "eta", "nextExpectedActivity", handlingEvents);
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    System.out.println(nextExpectedActivity);
  }
}