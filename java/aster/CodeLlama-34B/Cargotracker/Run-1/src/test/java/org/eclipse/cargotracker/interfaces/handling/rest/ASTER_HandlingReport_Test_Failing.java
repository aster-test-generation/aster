/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_jZIg0_1() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertNotNull(voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_jZIg0() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertNotNull(voyageNumber);
    assertEquals("Voyage number should be a non-empty string", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_gfAL0() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
    assertEquals("", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithEmptyString_pYhj2() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertEquals("", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingIdWithValidString_lIda5() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertEquals("valid", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_mdWc0() {
    HandlingReport handlingReport = new HandlingReport();
    String completionTime = handlingReport.getCompletionTime();
    assertNotNull(completionTime);
    assertEquals("2023-02-28T12:34:56.789Z", completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_WAdP0() {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertEquals("EventType", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithEmptyString_mbbf2() {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertEquals("", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventTypeWithInvalidString_gPcQ3() {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertEquals("InvalidEventType", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_jZIg0_2_fid2() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertEquals("Voyage number should be a non-empty string", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_gfAL0_1() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_mdWc0_1() {
    HandlingReport handlingReport = new HandlingReport();
    String completionTime = handlingReport.getCompletionTime();
    assertNotNull(completionTime);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_mdWc0_2() {
    HandlingReport handlingReport = new HandlingReport();
    String completionTime = handlingReport.getCompletionTime();
    assertEquals("2023-02-28T12:34:56.789Z", completionTime);
  }
}