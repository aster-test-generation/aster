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

public class Aster_ChangeArrivalDeadline_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetArrivalDeadline_gqmc0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate expected = LocalDate.now(); // Assuming the arrivalDeadline is set to the current date for this test
    assertEquals(expected, changeArrivalDeadline.getArrivalDeadline());
  }
}