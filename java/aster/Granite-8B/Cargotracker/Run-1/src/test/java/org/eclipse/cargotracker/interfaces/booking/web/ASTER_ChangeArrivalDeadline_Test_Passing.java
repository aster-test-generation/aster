/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadline_Test_Passing {
  private ChangeArrivalDeadline changeArrivalDeadline;

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_dxnz0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate arrivalDeadline = LocalDate.now();
    changeArrivalDeadline.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testgetTrackingId_Uazl0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    changeArrivalDeadline.setTrackingId("123456789");
    assertEquals("123456789", changeArrivalDeadline.getTrackingId());
  }
}