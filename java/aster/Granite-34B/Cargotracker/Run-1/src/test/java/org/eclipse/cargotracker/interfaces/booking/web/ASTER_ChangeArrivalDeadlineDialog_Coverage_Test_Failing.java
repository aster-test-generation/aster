/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;
import static org.mockito.Mockito.*;

public class Aster_ChangeArrivalDeadlineDialog_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_jdHT0() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    changeArrivalDeadlineDialog.cancel();
    verify(PrimeFaces.current().dialog(), times(1)).closeDynamic("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel2_rWgu1() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    changeArrivalDeadlineDialog.cancel();
    verifyNoMoreInteractions(PrimeFaces.current().dialog());
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingId_YFQr0() {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    String trackingId = "12345";
    dialog.showDialog(trackingId);
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithoutTrackingId_ROXz1() {
    ChangeArrivalDeadlineDialog dialog = new ChangeArrivalDeadlineDialog();
    dialog.showDialog(null);
  }
}