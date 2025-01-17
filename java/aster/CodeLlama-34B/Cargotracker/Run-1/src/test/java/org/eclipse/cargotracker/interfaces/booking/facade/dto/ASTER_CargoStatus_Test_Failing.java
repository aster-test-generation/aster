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

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_CargoStatus_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEtaWithNullHandlingEvents_sqnh9() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", null);
    assertEquals("eta", cargoStatus.getEta());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullEta_ijcD4() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, null, "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertEquals(null, nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEvents_Null_DixL2() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", null);
    List<TrackingEvents> events = cargoStatus.getEvents();
    assertNotNull(events);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullTrackingId_CRVY2_fid1() {
    CargoStatus cargoStatus = new CargoStatus(null, "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullDestination_bvXO3_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", null, "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullStatusText_GVUg4_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", null, true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullEta_zohH5_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, null, "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullNextExpectedActivity_BBJw6_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", null, new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_NullHandlingEvents_iCnc7_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", null);
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testIsMisdirected_EmptyHandlingEvents_goky8_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    assertFalse(cargoStatus.isMisdirected());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithMisdirected_OveY1_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText (misdirected)", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithEta_WLvm2_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText (eta: eta)", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithNextExpectedActivity_ynra3_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText (next expected activity: nextExpectedActivity)", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithHandlingEvents_VItl4_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText (handling events: [])", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetStatusTextWithAllParameters_XNtG5_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", true, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String actualStatusText = cargoStatus.getStatusText();
    assertEquals("statusText (misdirected, eta: eta, next expected activity: nextExpectedActivity, handling events: [])", actualStatusText);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullTrackingId_BiwJ1_fid1() {
    CargoStatus cargoStatus = new CargoStatus(null, "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullDestination_JiVF2_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", null, "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullStatusText_UNcK3_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", null, false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithNullEta_ijcD4_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, null, "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyTrackingId_dyxi6_fid1() {
    CargoStatus cargoStatus = new CargoStatus("", "destination", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyDestination_qGSO7_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "", "statusText", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyStatusText_FusZ8_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "", false, "eta", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyEta_gLkO9_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "", "nextExpectedActivity", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetNextExpectedActivityWithEmptyNextExpectedActivity_yfrC10_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "", new ArrayList<TrackingEvents>());
    String nextExpectedActivity = cargoStatus.getNextExpectedActivity();
    assertNull(nextExpectedActivity);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEvents_Null_DixL2_fid1() {
    CargoStatus cargoStatus = new CargoStatus("trackingId", "destination", "statusText", false, "eta", "nextExpectedActivity", null);
    List<TrackingEvents> events = cargoStatus.getEvents();
    assertNull(events);
  }
}