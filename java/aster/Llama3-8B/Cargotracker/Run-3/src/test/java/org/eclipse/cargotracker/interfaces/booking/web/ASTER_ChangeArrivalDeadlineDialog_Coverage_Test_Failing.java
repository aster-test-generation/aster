/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadlineDialog_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel2_ENed1() {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.cancel();
    try {
      PrimeFaces.current().dialog().closeDynamic("");
    } catch (Exception e) {
      fail("Expected PrimeFaces.current().dialog().closeDynamic(\"\"); to not throw an exception but it did");
    }
  }
}