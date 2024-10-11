/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
public class Aster_HandlingReportService_Coverage_Test_Failing {
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithNullCompletionTime_ReXm0() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setCompletionTime(null);
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithEmptyCompletionTime_gvGG1() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setCompletionTime("");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithValidCompletionTime_LYJn2() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setCompletionTime("2022-01-01T12:00:00");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithNullVoyageNumber_YVtq3() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setVoyageNumber(null);
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithEmptyVoyageNumber_DIME4() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setVoyageNumber("");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithValidVoyageNumber_oKWX5() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setVoyageNumber("123456");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithNullEventType_omKh6() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setEventType(null);
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithEmptyEventType_noPW7() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setEventType("");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithValidEventType_GjEt8() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setEventType("LOAD");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithNullTrackingId_tRHa9() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setTrackingId(null);
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithValidTrackingId_JwqI10() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setTrackingId("1234567890");
        handlingReportService.submitReport(handlingReport);
}
@Test
@Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
    public void testSubmitReportWithAllValidFields_CxpY11() {
        HandlingReportService handlingReportService = new HandlingReportService();
        HandlingReport handlingReport = new HandlingReport();
        handlingReport.setCompletionTime("2022-01-01T12:00:00");
        handlingReport.setVoyageNumber("123456");
        handlingReport.setEventType("LOAD");
        handlingReport.setTrackingId("1234567890");
        handlingReportService.submitReport(handlingReport);
    }
}