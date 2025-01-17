/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_gxLX0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String expected = "expectedUnLocode";
    String actual = handlingReport.getUnLocode();
    assertEquals(expected, actual);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocode_pVHv0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("testUnLocode");
    assertEquals("testUnLocode", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventType_pJpk0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("TestEvent");
    assertEquals("TestEvent", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_ggVl0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertEquals("Expected trackingId", trackingId, "");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_DYwJ0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("Test Voyage Number");
    assertEquals("Test Voyage Number", handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_oFOB0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertEquals("Expected voyage number", "actual voyage number", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_rfTg0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertEquals("eventType", eventType);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_cOKf0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("123456");
    assertEquals("123456", handlingReport.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_TrZZ0() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    String completionTime = handlingReport.getCompletionTime();
    assertEquals("Expected completion time", completionTime, "actual completion time");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_RTEt1() throws Exception {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01 12:00:00");
    assertEquals("2022-01-01 12:00:00", handlingReport.getCompletionTime());
  }
}