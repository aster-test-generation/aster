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
  public void testGetArrivalDeadline_TAUe0() throws Exception {
    ChangeArrivalDeadline cad = new ChangeArrivalDeadline();
    LocalDate expected = LocalDate.now(); // Assuming arrivalDeadline is set to current date for this test
    assertEquals(expected, cad.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_iEqg0() throws Exception {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String expected = null; // Assuming default constructor does not set trackingId
    String actual = changeArrivalDeadline.getTrackingId();
    assertEquals(expected, actual);
  }
}