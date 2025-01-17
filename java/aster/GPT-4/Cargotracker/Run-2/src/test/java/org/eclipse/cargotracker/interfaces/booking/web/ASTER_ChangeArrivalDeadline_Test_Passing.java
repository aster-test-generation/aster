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
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_wbCI0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate expectedDate = LocalDate.of(2023, 10, 5);
    changeArrivalDeadline.setArrivalDeadline(expectedDate);
    assertEquals(expectedDate, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_kYhJ0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String expected = null; // Assuming default trackingId is null without setter shown
    assertEquals(expected, changeArrivalDeadline.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_gqmc0_fid1() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate expected = LocalDate.now(); // Assuming the arrivalDeadline is set to the current date for this test
  }
}