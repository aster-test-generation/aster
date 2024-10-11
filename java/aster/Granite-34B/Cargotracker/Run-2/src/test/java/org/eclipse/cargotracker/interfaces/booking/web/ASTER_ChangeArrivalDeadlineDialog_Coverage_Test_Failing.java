/**
 * Generated by Aster
 */
package org.eclipse.cargotracker.interfaces.booking.web;

import java.util.*;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;
import org.primefaces.PrimeFaces;

import static org.junit.jupiter.api.Timeout.ThreadMode.SEPARATE_THREAD;

public class Aster_ChangeArrivalDeadlineDialog_Coverage_Test_Failing {
  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testCancel_MKCZ0() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    changeArrivalDeadlineDialog.cancel();
    PrimeFaces primeFaces = PrimeFaces.current();
    primeFaces.dialog().closeDynamic("");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingId_ZWjJ0() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    changeArrivalDeadlineDialog.showDialog("trackingId");
  }

  @Test
  @Timeout(value = 1, unit = TimeUnit.SECONDS, threadMode = SEPARATE_THREAD)
  public void testShowDialogWithTrackingIdAndOptions_DnpF1_yogX0() {
    ChangeArrivalDeadlineDialog changeArrivalDeadlineDialog = new ChangeArrivalDeadlineDialog();
    Map<String, Object> options = new HashMap<>();
    options.put("modal", true);
    options.put("draggable", true);
    options.put("resizable", false);
    options.put("contentWidth", 460);
    options.put("contentHeight", 440);
    Map<String, List<String>> params = new HashMap<>();
    List<String> values = new ArrayList<>();
    values.add("trackingId");
    params.put("trackingId", values);
    PrimeFaces.current().dialog().openDynamic("/admin/dialogs/change_arrival_deadline.xhtml", options, params);
  }
}