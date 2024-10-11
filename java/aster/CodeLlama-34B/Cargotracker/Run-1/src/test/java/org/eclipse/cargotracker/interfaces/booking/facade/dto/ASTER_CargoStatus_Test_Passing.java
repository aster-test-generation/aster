/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.facade.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoStatus_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_True_aHwj0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertTrue(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_False_lhce1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullTrackingId_CRVY2() {
    CargoStatus cargoStatus = new CargoStatus(null, "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullDestination_bvXO3() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", null, "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullStatusText_GVUg4() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", null, true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertTrue(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullEta_zohH5() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, null, "nextExpectedActivity", new ArrayList<TrackingEvents>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullNextExpectedActivity_BBJw6() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", null, new ArrayList<TrackingEvents>());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullHandlingEvents_iCnc7() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", Collections.emptyList());
    assertTrue(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_bhYj0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("trackingId", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNullTrackingId_sSrO1() {
    CargoStatus cargoStatus = new CargoStatus(null, "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertNull(cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithEmptyTrackingId_jBjX2() {
    CargoStatus cargoStatus = new CargoStatus("", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNullDestination_KtQK5() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", null, "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("trackingId", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithEmptyDestination_tdjp6() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("trackingId", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNullStatusText_lPjl9() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", null, false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("trackingId", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithEmptyStatusText_PNBz10() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("trackingId", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusText_oUZL0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithMisdirected_OveY1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithNextExpectedActivity_ynra3() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEta_UcCY0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("eta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithNullEta_Lgws1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, null, "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertNull(cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithEmptyEta_PivO2() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithInvalidEta_rIIZ4() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "invalidEta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("invalidEta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithNullNextExpectedActivity_anYX5() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", null, new ArrayList<TrackingEvents>());
    assertEquals("eta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithEmptyNextExpectedActivity_YyDe6() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "", new ArrayList<TrackingEvents>());
    assertEquals("eta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithInvalidNextExpectedActivity_nTJH8() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "invalidNextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("eta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivity_Pvrp0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertEquals("nextExpectedActivity", nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullTrackingId_BiwJ1() {
    CargoStatus cargoStatus = new CargoStatus(null, "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullDestination_JiVF2() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", null, "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullStatusText_UNcK3() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", null, false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullNextExpectedActivity_uAJs5() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", null, new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyTrackingId_dyxi6() {
    CargoStatus cargoStatus = new CargoStatus("", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyDestination_qGSO7() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertEquals("nextExpectedActivity", nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyStatusText_FusZ8() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertEquals("nextExpectedActivity", nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyEta_gLkO9() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyNextExpectedActivity_yfrC10() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertEquals("", nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEvents_Empty_pJGv0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    List<TrackingEvents> events = cargoStatus.getEvents();
    assertEquals(0, events.size());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNonStringTrackingId_uLtS4_IAEM0() {
    CargoStatus cargoStatus = new CargoStatus("123", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("123", cargoStatus.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithNonStringDestination_GpFF8_JdCR0() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "123", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertEquals("trackingId", cargoStatus.getTrackingId());
  }
}