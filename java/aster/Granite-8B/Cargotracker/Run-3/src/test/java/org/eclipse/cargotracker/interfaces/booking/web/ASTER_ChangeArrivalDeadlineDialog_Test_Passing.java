/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadlineDialog_Test_Passing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialog_CAJS0() throws Exception {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.showDialog("12345");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_xmlx0_1() throws Exception {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.cancel();
    dialog.cancel();
    assertNotNull(PrimeFaces.current());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_xmlx0_2() throws Exception {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.cancel();
    dialog.cancel();
    assertNotNull(PrimeFaces.current().dialog());
  }
}