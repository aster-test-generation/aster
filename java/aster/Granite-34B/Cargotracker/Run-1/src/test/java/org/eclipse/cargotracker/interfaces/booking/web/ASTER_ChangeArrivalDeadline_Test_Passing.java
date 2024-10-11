/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.eclipse.cargotracker.interfaces.booking.facade.dto.CargoRoute;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadline_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCargoRoute_getCargo_qKKe0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    CargoRoute cargo = changeArrivalDeadline.getCargo();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_GLMY0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate arrivalDeadline = LocalDate.now();
    changeArrivalDeadline.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadlineWithNull_IGxl1() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate arrivalDeadline = null;
    changeArrivalDeadline.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadlineWithFutureDate_Nxbk2() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate arrivalDeadline = LocalDate.now().plusDays(1);
    changeArrivalDeadline.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadlineWithPastDate_jsvR3() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate arrivalDeadline = LocalDate.now().minusDays(1);
    changeArrivalDeadline.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testTrackingId_qFvr0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = changeArrivalDeadline.getTrackingId();
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testTrackingIdCoverage_BNmH2() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = changeArrivalDeadline.getTrackingId();
    trackingId = "test";
    trackingId = null;
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_gUlY0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = "12345";
    changeArrivalDeadline.setTrackingId(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdNull_TMjX1() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = null;
    changeArrivalDeadline.setTrackingId(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdEmpty_WNrM2() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = "";
    changeArrivalDeadline.setTrackingId(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingIdInvalid_XRTV3() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = "abcde";
    changeArrivalDeadline.setTrackingId(trackingId);
  }
}