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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadline_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetArrivalDeadline_NQJn0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    LocalDate arrivalDeadline = LocalDate.of(2022, 12, 31);
    changeArrivalDeadline.setArrivalDeadline(arrivalDeadline);
    assertEquals(arrivalDeadline, changeArrivalDeadline.getArrivalDeadline());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testSetTrackingId_nzXV0() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    changeArrivalDeadline.setTrackingId("1234567890");
    assertEquals("1234567890", changeArrivalDeadline.getTrackingId());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testGetTrackingId_bSam0_fid1() {
    ChangeArrivalDeadline changeArrivalDeadline = new ChangeArrivalDeadline();
    String trackingId = changeArrivalDeadline.getTrackingId();
    assertNull(trackingId);
  }
}