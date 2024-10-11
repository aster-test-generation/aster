/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.handling.rest;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_HandlingReport_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetUnLocode_OFmQ0() {
    HandlingReport handlingReport = new HandlingReport();
    String unLocode = handlingReport.getUnLocode();
    assertNotNull(unLocode);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetVoyageNumber_xPdj0() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertNotNull(voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_WFad0() {
    HandlingReport handlingReport = new HandlingReport();
    String trackingId = handlingReport.getTrackingId();
    assertNotNull(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_tTIM0() {
    HandlingReport handlingReport = new HandlingReport();
    String eventType = handlingReport.getEventType();
    assertNotNull(eventType);
  }
}