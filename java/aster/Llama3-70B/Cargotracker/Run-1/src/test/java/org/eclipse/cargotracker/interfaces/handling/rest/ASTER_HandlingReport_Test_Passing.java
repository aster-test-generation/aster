/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocode_WfVj0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("TEST_UN_LOCODE");
    assertEquals("TEST_UN_LOCODE", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventType_bSNm0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("TestEvent");
    assertEquals("TestEvent", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_iJBc0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("V123");
    assertEquals("V123", handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_PGDX0() {
    HandlingReport handlingReport = new HandlingReport();
    String expected = "some completion time";
    handlingReport.setCompletionTime(expected);
    String actual = handlingReport.getCompletionTime();
    assert actual.equals(expected);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_CKjt0() {
    HandlingReport report = new HandlingReport();
    report.setCompletionTime("2022-01-01 12:00:00");
    assertEquals("2022-01-01 12:00:00", report.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_kRtv0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("12345");
    assertEquals("12345", handlingReport.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_OFmQ0_fid1() {
    HandlingReport handlingReport = new HandlingReport();
    String unLocode = handlingReport.getUnLocode();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_xPdj0_fid1() {
    HandlingReport handlingReport = new HandlingReport();
    assertNull(handlingReport.getVoyageNumber());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_WFad0_fid1() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_tTIM0_fid1() {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertNull(eventType);
  }
}