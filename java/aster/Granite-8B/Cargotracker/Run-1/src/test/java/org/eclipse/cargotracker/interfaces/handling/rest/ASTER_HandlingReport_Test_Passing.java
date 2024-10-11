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
  {
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventType_mdPG0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Sample Event Type");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeWithNull_ediC1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetEventTypeWithEmptyString_nVKJ2() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetVoyageNumber_VgCM0() {
    HandlingReport handlingReport = new HandlingReport();
    String voyageNumber = handlingReport.getVoyageNumber();
    assertEquals("voyageNumber", "voyageNumber", voyageNumber);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetEventType_CKzw0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setEventType("Event Type");
    assertEquals("Event Type", handlingReport.getEventType());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetVoyageNumber_tJjI1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setVoyageNumber("value");
  }
}