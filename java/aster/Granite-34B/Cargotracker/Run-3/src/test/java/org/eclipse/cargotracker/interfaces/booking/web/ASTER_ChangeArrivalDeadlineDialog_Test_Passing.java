/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadlineDialog_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_MQFh0() throws Exception {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.cancel();
    assertTrue(true); // No specific assertion needed, just checking ifnew ChangeArrivalDeadlineDialog().cancel() executes without errors
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancelWithPrimeFacesDialogCloseDynamic_CiZo1() throws Exception {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.cancel();
  }
}