/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReportService_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithValidHandlingReport_Xmou0() {
    HandlingReportService handlingReportService = new HandlingReportService();
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("UNLOCODE");
    handlingReport.setEventType("EventType");
    handlingReport.setVoyageNumber("VOYAGE_NUMBER");
    handlingReport.setTrackingId("TRACKING_ID");
    handlingReport.setCompletionTime("2022-01-01T12:00:00");
    handlingReportService.submitReport(handlingReport);
  }
}