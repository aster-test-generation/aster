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
  HandlingReportService handlingReportService;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithCompletionTime_Siww1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01T12:00:00");
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithVoyageNumber_Asms2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("123456");
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithTrackingId_NBmC3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("123456789");
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithEventType_JlKG4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("RECEPTION");
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithUnLocode_NIgV5() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("USCHI");
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithAllFields_uhEc6() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01T12:00:00");
    handlingReport.setVoyageNumber("123456");
    handlingReport.setTrackingId("123456789");
    handlingReport.setEventType("RECEPTION");
    handlingReport.setUnLocode("USCHI");
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithNullCompletionTime_GhrP7() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime(null);
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithNullVoyageNumber_vVZC8() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber(null);
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithNullTrackingId_jwNW9() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId(null);
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithNullEventType_Wvsz10() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType(null);
    handlingReportService.submitReport(handlingReport);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSubmitReportWithNullUnLocode_Yppn11() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode(null);
    handlingReportService.submitReport(handlingReport);
  }
}