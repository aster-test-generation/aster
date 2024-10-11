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
  public void testSetUnLocode_MyHQ0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("ABC123");
    assertEquals("ABC123", handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeWithInvalidInput_AAWO1() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("ABC12");
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeWithNullInput_XRzz3() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode(null);
    assertEquals(null, handlingReport.getUnLocode());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetUnLocodeWithEmptyInput_ogPE4() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setUnLocode("");
    assertNull(null);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_IfZv0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setTrackingId("12345");
    String trackingId = handlingReport.getTrackingId();
    assertEquals("12345", trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetCompletionTime_vfXZ0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-01-01");
    assertEquals("2022-01-01", handlingReport.getCompletionTime());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetCompletionTime_vnlG0() {
    HandlingReport handlingReport = new HandlingReport();
    handlingReport.setCompletionTime("2022-10-15T10:00:00");
    assertEquals("2022-10-15T10:00:00", handlingReport.getCompletionTime());
  }
}