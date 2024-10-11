/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReportService_Coverage_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithoutTrackingId_rsPo4_wWDw0() {
    HandlingReportService handlingReportService = new HandlingReportService();
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("UNLOCODE");
    handlingReport.setEventType("EventType");
    handlingReport.setVoyageNumber("VOYAGE_NUMBER");
    handlingReport.setCompletionTime("2022-01-01T12:00:00");
    try {
      handlingReport.setTrackingId(null);
      handlingReportService.submitReport(handlingReport);
      fail("Expected HandlingReportException");
    } catch (Exception e) {
    }
  }
}